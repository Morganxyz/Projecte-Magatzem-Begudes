
public class BegudesSenseSucre extends Begudes{
	
	private String origen;
	
	public BegudesSenseSucre(int id,float llitres,float preu,String marca,String origen) {
		super(id,llitres,preu,marca);
		this.origen = origen;
	}
	
	public String getOrigen() {
		return this.origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String toString() {
		return "La beguda d´identificador " + super.getId() + " té " + super.getLLitres() + " llitres , un preu de "
				+ super.getPreu() + " Euros, es de la marca " + super.getMarca() + " i el seu origen es "
				+ this.origen + " .";
	}

}
