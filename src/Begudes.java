
public class Begudes {

	private int id;
	private float llitres;
	private float preu;
	private String marca;
	
	public Begudes(int id,float llitres,float preu,String marca) {
		this.id = id;
		this.llitres = llitres;
		this.preu = preu;
		this.marca = marca;
	}
	
	public int getId() {
		return this.id;
	}
	public float getLLitres() {
		return this.llitres;
	}
	public float getPreu() {
		return this.preu;
	}
	public String getMarca() {
		return this.marca;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setLlitres(float llitres) {
		this.llitres = llitres;
	}
	public void setPreu(float preu) {
		this.preu = preu;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
