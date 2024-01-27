package storage

import model.dungeon.Dungeon
import model.dungeon.Monster

val dungeonRuntimeStorage = listOf(
    Dungeon(
        id = 0,
        name = "First dungeon",
        theme = questionThemeRuntimeStorage[0],
        levelThreshold = 1,
        backgroundUri = null,
        monsters = mutableListOf<Monster>()
    ),
    Dungeon(
        id = 1,
        name = "Second dungeon",
        theme = questionThemeRuntimeStorage[0],
        levelThreshold = 2,
        backgroundUri = null,
        monsters = mutableListOf<Monster>()
    )
)