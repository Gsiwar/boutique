package models;

public class Article {
	
	private long id;
	private String nom;
	private String type;
	private int pt;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(long id, String nom, String type, int pt) {
		super();
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.pt = pt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPt() {
		return pt;
	}

	public void setPt(int pt) {
		this.pt = pt;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", type=" + type + ", pt=" + pt + "]";
	}
	
	

}
