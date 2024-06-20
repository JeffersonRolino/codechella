package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario(
                        "123456789-99",
                        "Jon Snow",
                        LocalDate.parse("1990-07-08"),
                        "jonsnow@nightswatch.com")
        );

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario(
                        "",
                        "Jon Snow",
                        LocalDate.parse("1990-07-08"),
                        "jonsnow@nightswatch.com")
        );
    }
}
