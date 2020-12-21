package com.code.sysPedidos_backend.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.code.sysPedidos_backend.Dao.PersonaDao;
import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.Persona;
import com.code.sysPedidos_backend.Entity.Usuario;
import com.google.gson.Gson;




@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UserDao ud;
	@Autowired
	private PersonaDao pd;

Gson g = new Gson();
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario usuario = ud.read(authentication.getName());
		Persona per = pd.read(usuario.getIdusuario());
		Map<String,Object> datos = new HashMap<>();	
		datos = ud.datos(authentication.getName());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(datos);

		return accessToken;
	}

}
