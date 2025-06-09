package com.david.backend.entities;

import java.util.List;

public record LoginResponse (String username, List<String> authorities, String token){

}
