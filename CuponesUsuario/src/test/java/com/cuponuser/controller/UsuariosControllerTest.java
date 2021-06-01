package com.cuponuser.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UsuariosControllerTest {

	@Autowired
	 private UsuariosController controller;

	 @Test
	 public void create() {
	  assertThat(controller).isNotNull();
	 }
	 @Test
	 public void home() {
	  assertThat(controller).isNotNull();
	 }
	 @Test
	 public void save() {
	  assertThat(controller).isNotNull();
	 }
}
