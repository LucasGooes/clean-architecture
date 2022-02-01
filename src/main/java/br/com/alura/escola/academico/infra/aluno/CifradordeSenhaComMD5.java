package br.com.alura.escola.academico.infra.aluno;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.alura.escola.academico.dominio.aluno.CifradorDeSenha;

public class CifradordeSenhaComMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(senha.getBytes());
			byte[] bytes= md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {
				//sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 19).substring(); INCONPLETO
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error ao gerar senha encriptada");
		}
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta) {
		return senhaCifrada.equals(cifrarSenha(senhaAberta));
	}
	
	

}
