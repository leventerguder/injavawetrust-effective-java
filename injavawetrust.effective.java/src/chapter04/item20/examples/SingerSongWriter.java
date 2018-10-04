package chapter04.item20.examples;

public interface SingerSongWriter extends Singer, SongWriter {

}
// In real life , some singers are also songwriters.
// Because we used interfaces rather than abstract classes to define these types.
// We can define a third interface that extends both Singer and SongWriter and adds new method that are appropriate to the combination.

// The alternative is a bloated class hierarchy cotntaining a spearate class for every supported combination of attributes.
// if there are n attributes in the type system , there are  2^n possible combinations that you might have to support.
// This is what is known as a combinatorial explosion. 
// TODO 