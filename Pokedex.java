package pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
	private static ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon poke = new Pokemon(name, health, type);
		pokedex.add(poke);
		return poke;
	}

	public void listPokemon() {
		for (Pokemon pokemon : pokedex) {
			System.out.println(this.pokemonInfo(pokemon));
		}
	}
	
}
