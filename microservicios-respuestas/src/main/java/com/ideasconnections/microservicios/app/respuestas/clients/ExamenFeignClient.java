package com.ideasconnections.microservicios.app.respuestas.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ideasconnections.microservicios.commons.examenes.models.entity.Examen;

@FeignClient(name = "microservicio-examenes")
public interface ExamenFeignClient {
	
	@GetMapping("/{id}")
	public Examen obtenerExamenPorId(@PathVariable Long id);

}
