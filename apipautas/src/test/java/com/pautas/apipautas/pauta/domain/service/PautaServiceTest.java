package com.pautas.apipautas.pauta.domain.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.pautas.apipautas.pauta.domain.PautaIRepository;
import com.pautas.apipautas.pauta.domain.mocks.PautaMock;
import com.pautas.apipautas.pauta.domain.vo.OutPautaVO;


@RunWith(SpringRunner.class)
public class PautaServiceTest {

	@InjectMocks
	private PautaService service;
	
	@Mock
	private PautaIRepository repository;
	
	@Test
	public void getSaveSucess() {
		
		Mockito.when(repository.save(PautaMock.createPauta())).thenReturn(PautaMock.createPauta());
		OutPautaVO pauta = service.save(PautaMock.createPautaVO());
		assertTrue(pauta!= null);
	}
}
