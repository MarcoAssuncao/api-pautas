package com.pautas.apipautas.votacao.domain.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.pautas.apipautas.votacao.domain.VotoIRepository;
import com.pautas.apipautas.votacao.domain.mocks.VotoMock;
import com.pautas.apipautas.votacao.domain.vo.OutVotoVO;

@RunWith(SpringRunner.class)
public class VotoServiceTest {

	@InjectMocks
	private VotoService service;
	
	@Mock
	private VotoIRepository repository;

	
	@Test
	public void getSaveSucess() {
		
		Mockito.when(repository.save(VotoMock.create())).thenReturn(VotoMock.create());
		OutVotoVO votoOut = service.save(VotoMock.createInVO());
		assertTrue(votoOut!= null);
	}
}
