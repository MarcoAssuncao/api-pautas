package com.pautas.apipautas.associado.domain.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pautas.apipautas.associado.domain.AssociadoIRepository;
import com.pautas.apipautas.associado.domain.mocks.AssociadoMock;
import com.pautas.apipautas.associado.domain.vo.OutAssociadoVO;

@RunWith(SpringJUnit4ClassRunner.class)
public class AssociadoServiceTest {

	@InjectMocks
	private AssociadoService associadoService;

	@Mock
	private AssociadoIRepository repository;

	@Test
	public void getSaveSucess() {

		Mockito.when(repository.save(AssociadoMock.create())).thenReturn(AssociadoMock.create());
		OutAssociadoVO associadoAssert = associadoService.save(AssociadoMock.createValueObject());
		assertEquals("1", associadoAssert.getCodigoAssociado().toString());
	}

}
