package com.example.banco;

import com.example.banco.Modelos.Movimientos;
import com.example.banco.Repositorios.MovimientoRepositorio;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BancoApplicationTests {

    @Autowired
    private MovimientoRepositorio movimientoRepositorio;
    
    @Test
    public void BusquedaMovimientosPorFecha() {
        List<Movimientos> result = (List<Movimientos>) movimientoRepositorio.findAll();
       for(Movimientos mov : result){
       
           System.out.println("Moviemineto "+mov.getIdMonimiento());
       }
    
       
    }
    
    
	@Test
	void contextLoads() {
	}
        
        
       
        

}
