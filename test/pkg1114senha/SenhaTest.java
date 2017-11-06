package pkg1114senha;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sahra
 */
public class SenhaTest {
    
    @Test
    public void teste1(){
        System.out.println("Digitando senha 2200");
        VerificarSenha verifica = new VerificarSenha();
        int expResult = 0; // Retorna que a senha é invalida
        int result = verifica.Senha(2200);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste2(){
        System.out.println("Digitando senha 1020");
        VerificarSenha verifica = new VerificarSenha();
        int expResult = 0; // Retorna que a senha é invalida
        int result = verifica.Senha(1020);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste3(){
        System.out.println("Digitando senha 2022");
        VerificarSenha verifica = new VerificarSenha();
        int expResult = 0; // Retorna que a senha é invalida
        int result = verifica.Senha(2022);
        assertEquals(expResult, result);
    }
    
    @Test
    public void teste4(){
        System.out.println("Digitando senha 2002");
        VerificarSenha verifica = new VerificarSenha();
        int expResult = 1; // Acesso permitido
        int result = verifica.Senha(2002);
        assertEquals(expResult, result);
    }

}
