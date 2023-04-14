public class Carta {
	
    private String parola;
    private String sinonimo1;
    private String sinonimo2;
    private String sinonimo3;
    private String sinonimo4;
    private String sinonimo5;

    public Carta(String parola, String sinonimo1, String sinonimo2, String sinonimo3, String sinonimo4, String sinonimo5) {
		super();
    	this.parola = parola;
		this.sinonimo1 = sinonimo1;
		this.sinonimo2 = sinonimo2;
		this.sinonimo3 = sinonimo3;
		this.sinonimo4 = sinonimo4;
		this.sinonimo5 = sinonimo5;
	}

	public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getSinonimo1() {
        return sinonimo1;
    }

    public void setSinonimo1(String sinonimo1) {
        this.sinonimo1 = sinonimo1;
    }
    
    public String getSinonimo2() {
		return sinonimo2;
	}

	public void setSinonimo2(String sinonimo2) {
		this.sinonimo2 = sinonimo2;
	}

	public String getSinonimo3() {
		return sinonimo3;
	}

	public void setSinonimo3(String sinonimo3) {
		this.sinonimo3 = sinonimo3;
	}

	public String getSinonimo4() {
		return sinonimo4;
	}

	public void setSinonimo4(String sinonimo4) {
		this.sinonimo4 = sinonimo4;
	}

	public String getSinonimo5() {
		return sinonimo5;
	}

	public void setSinonimo5(String sinonimo5) {
		this.sinonimo5 = sinonimo5;
	}

	@Override
    public String toString() {
        return "Carta{" +
                "parola='" + parola + '\'' +
                '}';
    }
}