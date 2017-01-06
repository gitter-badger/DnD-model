package io.darkvalley.dnd.model

/**
  * Created by anmurgia on 05/01/17.
  */
case class Modifier(value: Int, _sources: Iterable[Visitable[Stat, Modifier]]) extends Aggregable[Stat] {

  override def aggregate(x: Stat): Stat = x.copy(baseVal = x.baseVal + value)

  override type Self = Modifier

  override def sources(): Iterable[Visitable[Stat, Self]] = _sources
}
