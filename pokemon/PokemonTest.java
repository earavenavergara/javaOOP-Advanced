package pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon pk1=new Pokemon("bulbasaur", 100, "grass");
		Pokemon pk2=new Pokemon("charmander", 100, "fire");
		System.out.println(pk1.getHealth());
		pk1.attackPokemon(pk2);
		System.out.println(pk2.getHealth());
		Pokedex pk=new Pokedex();
		Pokemon pk3=pk.createPokemon("squirtle", 100, "water");
		System.out.println(pk.pokemonInfo(pk3));
		

	}

}
