package br.com.monitorweb.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static br.com.monitorweb.entity.factoryTetst.equalComparandoObjetoTest;

@RunWith(MockitoJUnitRunner.class)
public class MonitoramentoSwapTest {

    @Test
    public void equalObjetoTest(){
        equalComparandoObjetoTest("br.com.monitorweb.entity.MonitoramentoSwap","br.com.monitorweb.entity.Dominio");
    }
}