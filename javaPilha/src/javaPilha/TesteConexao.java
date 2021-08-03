package javaPilha;

public class TesteConexao {

		public static void main(String[] args) throws Exception {
								
			Conexao con = null;
			try {
				con = new Conexao();
				con.leDados();
			} catch(IllegalStateException ex) {
				System.out.println("Deu erro na conexão");
			}finally {
				if(con != null) {
					con.close();
				}
			}
		}
}
