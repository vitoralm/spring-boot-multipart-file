package br.com.teste.upload.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.teste.upload.store.Arquivo;

@RestController
@RequestMapping("/fotos")
public class FotoResource {

	@Autowired
	private Arquivo arq;

	@PostMapping
	public void upload(@RequestParam MultipartFile foto) {
		arq.salvarFoto(foto);
	}
}
