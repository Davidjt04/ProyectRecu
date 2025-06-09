package com.david.backend.entities;

//record declara una clase inmutabe que solo contiene datos
public record UserRegisterDTO(String username, String email, String password, String password2) {

}
