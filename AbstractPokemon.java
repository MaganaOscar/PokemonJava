package pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon() {
		Pokemon poke = new Pokemon("vikavolt", 100, "electric");
		return poke;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName() + "\nHealth: " + pokemon.getHealth() 
			+ "\nType: " + pokemon.getType();
	}
}
