/* Classe Pro */
class Pro {

	//prénom
	String lastName

	//nom
	String firstName

	//taille
	//TODO

	//date de naissance
	//TODO

	//constructeur
	public Pro(String firstName, String lastName) {
		this.firstName = firstName
		this.lastName = lastName
	}
	
	//Affiche la carte d'identité du pro
	String showPro() {
		println "Mon prénom est : ${this.firstName}"
		println "Mon nom est : ${this.lastName}"
		
		//Afficher la taille
		//Afficher l'age en années
		//TODO
	}

	//Calcule l'age du pro : prend la date de naissance en entrée et renvoie l'age en sortie
	//TODO

	//Main -> lancement du programme
	public static void main(String[] args) {
		println "START"	
		
		Pro p1 = new Pro("Marine", "CRISTOL") 
		p1.showPro()

		//Instancier un objet de type School
		//TODO

		//Afficher ses infos		
		//Créer 5 objets de type school avec une boucle while
		//TODO
		//Créer une liste et y ajouter les 5 objets school avec une boucle for
		LinkedList<Pro> l1 = new LinkedList<Pro>()
		//TODO

		println "END"
	}

}

/* Classe School, fille de Pro */
class School extends Pro {

        //raison sociale
        //TODO

        //constructeur
        public School(String firstName, String lastName, String firmName) {
		//TODO                
        }

}

