package pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex tester = new Pokedex();
		
		Pokemon bob = tester.createPokemon("bob", 100, "fire");
		Pokemon max = tester.createPokemon("max", 100, "flying");
		
		System.out.println(max.getHealth());
		bob.attackPokemon(max);
		System.out.println(max.getHealth());
		tester.listPokemon();
	}

}
