package com.alura.forohub.domain.topicos;

import com.alura.forohub.domain.usuarios.Usuario;
import java.time.LocalDateTime;

public record DatosListadoTopico (
        Long id,
        String titulo,
        String mensaje,
        Estado status,
        String autorx,
        String nombreCurso,
        LocalDateTime fecha){
    public DatosListadoTopico(Topico topico){
        this(topico.getId(),topico.getTitulo(),topico.getMensaje(),topico.getStatus(),topico.getAutorx().getUsername(),topico.getNombreCurso(),topico.getFecha());
    }
}