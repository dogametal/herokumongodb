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
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User douglas = new User(null, "Douglas Silva", "douglas.it.soares@gmail.com");
		User daniel = new User(null, "Daniel Soares", "daniel.bebe.soares@gmail.com");
		User viviane = new User(null, "Viviane Sousa", "vivi.mae@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob, douglas, daniel));
		
		postRepository.deleteAll();
		Post post1 = new Post(null,sdf.parse("26/11/2020"), "Partiu nascimento", "Seja bem vindo, filho !", new AuthorDTO(douglas));
		Post post2 = new Post(null,sdf.parse("27/11/2020"), "Nasceu  !!!", "Papai ama Daniel ", new AuthorDTO(douglas));
		Post post3 = new Post(null,sdf.parse("10/12/2020"), "Oiee Papai  !!!", "Bebê ama Papai ...", new AuthorDTO(daniel));
		Post post4 = new Post(null,sdf.parse("11/12/2020"), "Lindos e que bom !!!", "Primeiro filho é um presente", new AuthorDTO(maria));
		Post post5 = new Post(null,sdf.parse("27/01/2021"), "Meu filhinho nasceu rs", "Louvado seja Deus !", new AuthorDTO(viviane));
		Post post6 = new Post(null,sdf.parse("24/03/2021"), "New version of Mavem for Java 1.8 :)", "Good Luck", new AuthorDTO(douglas));
		
		CommentDTO c1 = new CommentDTO("Good News, Doug", sdf.parse("26/11/2020"), new AuthorDTO(maria));
		CommentDTO c2 = new CommentDTO("Luck my friend, be patient !", sdf.parse("26/11/2020"), new AuthorDTO(bob));
		CommentDTO c3 = new CommentDTO("Your the man Congratulations my friend !", sdf.parse("27/11/2020"), new AuthorDTO(alex));
		CommentDTO c4 = new CommentDTO("Parabéns Vivi !", sdf.parse("27/01/2021"), new AuthorDTO(douglas));
		CommentDTO c5 = new CommentDTO("Obrigado Maria. ", sdf.parse("11/12/2020"), new AuthorDTO(douglas));
		
		post1.getComments().addAll(Arrays.asList(c1, c2));
		post2.getComments().addAll(Arrays.asList(c3));
		post4.getComments().addAll(Arrays.asList(c5));
		post5.getComments().addAll(Arrays.asList(c4));
		
		postRepository.saveAll(Arrays.asList(post1, post2, post3, post4, post5, post6));
		
		douglas.getPosts().addAll(Arrays.asList(post1, post2));
		daniel.getPosts().addAll(Arrays.asList(post3));
		maria.getPosts().addAll(Arrays.asList(post4));
		viviane.getPosts().addAll(Arrays.asList(post5));
		
		userRepository.saveAll(Arrays.asList(douglas, daniel, maria, viviane));
		
		
	}
	
	

}
