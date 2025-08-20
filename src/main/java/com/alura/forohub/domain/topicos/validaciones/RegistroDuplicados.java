package com.alura.forohub.domain.topicos.validaciones;

import com.alura.forohub.domain.topicos.DatosCrearTopico;
import com.alura.forohub.domain.topicos.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistroDuplicados implements ValidadorDeTopicos{
    @Autowired
    private TopicoRepository topicoRepository;

    public void validar(DatosCrearTopico datos){
        var titulo = datos.titulo();
        var mensaje = datos.mensaje();

        var registroDuplicado = topicoRepository.existsByTituloAndMensaje(titulo, mensaje);

        if(registroDuplicado){
            throw new ValidationException("Mensaje duplicado en este título");
        }
    }

}