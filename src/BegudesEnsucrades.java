
public class BegudesEnsucrades extends Begudes{

	private int sucre;
	private int promocio;
	
	public BegudesEnsucrades(int id,float llitres,float preu,String marca,int sucre,int promocio) {
		super(id,llitres,preu,marca);
		this.sucre = sucre;
		this.promocio = promocio;
	}
	
	public int getSucre() {
		return this.sucre;
	}
	public int getPromocio() {
		return this.promocio;
	}
	public void setSucre(int sucre) {
		this.sucre = sucre;
	}
	public void setPromocio(int promocio) {
		this.promocio = promocio;
	}
	
	public String toString() {
		return "La beguda d´identificador " + super.getId() + " té " + super.getLLitres() + " llitres , un preu de "
				+ super.getPreu() + " Euros, es de la marca " + super.getMarca() + " te un percentatge de "
				+ " sucre del " + this.sucre + " %, i disposa de una promoció de venta del " + this.promocio
				+ " %.";
	}
	
}
