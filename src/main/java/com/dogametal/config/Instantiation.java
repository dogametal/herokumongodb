package com.dogametal.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.dogametal.domain.Post;
import com.dogametal.domain.User;
import com.dogametal.dto.AuthorDTO;
import com.dogametal.dto.CommentDTO;
import com.dogametal.repository.PostRepository;
import com.dogametal.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {	
		/*Testando 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		User maria = new User(null, "Maria", "maria@gmail.com");
		User alex = new User(null, "Alexandre", "alex@gmail.com");
		User bob = new User(null, "Roberto", "bob@gmail.com");
		User douglas = new User(null, "Douglas Silva", "douglas.it.soares@gmail.com");
		User daniel = new User(null, "Daniel Soares", "daniel.bebe.soares@gmail.com");
		User viviane = new User(null, "Viviane Sousa", "vivi.mae@gmail.com");
		User iolanda = new User(null, "Iolanda Soares", "io_soares@hotmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob, douglas, daniel));
		
		postRepository.deleteAll();
		Post post1 = new Post(null,sdf.parse("26/11/2020"), "Partiu nascimento", "Seja bem vindo, filho !", new AuthorDTO(douglas));
		Post post2 = new Post(null,sdf.parse("27/11/2020"), "Nasceu  !!!", "Papai ama Daniel ", new AuthorDTO(douglas));
		Post post3 = new Post(null,sdf.parse("10/12/2020"), "Oiee Papai  !!!", "Bebê ama Papai ...", new AuthorDTO(daniel));
		Post post4 = new Post(null,sdf.parse("11/12/2020"), "Lindos e que bom !!!", "Primeiro filho é um presente", new AuthorDTO(maria));
		Post post5 = new Post(null,sdf.parse("27/01/2021"), "Meu filhinho nasceu rs", "Louvado seja Deus !", new AuthorDTO(viviane));
		Post post6 = new Post(null,sdf.parse("24/03/2021"), "Filho abençoado por Deus AMOR do papai mais feliz no mundo! :) Soh Alegria :)", "Good Luck", new AuthorDTO(douglas));
		Post post7 = new Post(null,sdf.parse("20/04/2021"), "Agora preciso de um novo trabalho, tenho um bebê recém nascido rs :) Vida que segue :)", "À disposição", new AuthorDTO(douglas));
		
		CommentDTO c1 = new CommentDTO("Ótima notícia, Douglas", sdf.parse("26/11/2020"), new AuthorDTO(maria));
		CommentDTO c2 = new CommentDTO("Felicidades e seja paciente nesta fase !", sdf.parse("26/11/2020"), new AuthorDTO(bob));
		CommentDTO c3 = new CommentDTO("Cara, parabéns meu amigo!", sdf.parse("27/11/2020"), new AuthorDTO(alex));
		CommentDTO c4 = new CommentDTO("Parabéns Vivi !", sdf.parse("27/01/2021"), new AuthorDTO(douglas));
		CommentDTO c5 = new CommentDTO("Obrigado Maria. ", sdf.parse("11/12/2020"), new AuthorDTO(douglas));
		
		post1.getComments().addAll(Arrays.asList(c1, c2));
		post2.getComments().addAll(Arrays.asList(c3));
		post4.getComments().addAll(Arrays.asList(c5));
		post5.getComments().addAll(Arrays.asList(c4));
		
		postRepository.saveAll(Arrays.asList(post1, post2, post3, post4, post5, post6, post7));
		
		douglas.getPosts().addAll(Arrays.asList(post1, post2));
		daniel.getPosts().addAll(Arrays.asList(post3));
		maria.getPosts().addAll(Arrays.asList(post4));
		viviane.getPosts().addAll(Arrays.asList(post5));
		
		userRepository.saveAll(Arrays.asList(douglas, daniel, maria, viviane, iolanda));
		

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
	
		
		User newuser = new User(null, "Rodrigues", "rodrigues@hotmail.com");		
		userRepository.saveAll(Arrays.asList(newuser));
		
		Post newpost = new Post(null,sdf.parse("29/04/2021"), "Manhã gelada em Cotia :( Bora trabalhar ", "Um ótimo dia", new AuthorDTO(newuser));
		postRepository.saveAll(Arrays.asList(newpost));
		
		newuser.getPosts().addAll(Arrays.asList(newpost));		
		userRepository.saveAll(Arrays.asList(newuser));		

*/
	}

	

}
