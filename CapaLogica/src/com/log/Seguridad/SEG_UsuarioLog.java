package com.log.Seguridad;

import com.dao.Seguridad.*;
import com.ent.Seguridad.*;

public class SEG_UsuarioLog {
	//Singleton
	public static SEG_UsuarioLog _Instancia;
	private SEG_UsuarioLog(){};
	public static SEG_UsuarioLog Instancia(){
		if(_Instancia==null){
			_Instancia = new SEG_UsuarioLog();
		}
		return _Instancia;
	}
	//endSingleton
	
	public SEG_UsuarioEnt VerificarAcceso(String _Login, String _Passw) throws Exception{
		try {
			return SEG_UsuarioDao.Instancia().VerificarAcceso(_Login, _Passw);
		} catch (Exception e) {
			throw e;
		}
	}
}
