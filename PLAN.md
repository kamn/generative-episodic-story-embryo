# Plan

From the github issue I created.

## NanoGenMo 2017 issue 65 
> Super excited to generate something interesting this year.
> This year I have a sort of incremental strategy. Not totally sure how much time I can devote but I have some grand plans. The key points are below. 
> - Basic ["Story Embryo"](http://channel101.wikia.com/wiki/Story_Structure_104:_The_Juicy_Details) structure and episodic chapters. Sort of like [Story Compiler](https://github.com/dariusk/NaNoGenMo-2015/issues/11) from 2015.
> - Some world state that persists between chapters(Simulationist)
> - Use some planner that takes PDDL so the characters have plans on how to solve issues. This will be sort of difficult to figure out how to setup a planner but I think possible to use or make one if needed
> - "Personal Worldviews" A global view of how the world works would what is actually possible in a story but characters might have incomplete views and while trying to carry out a plan fail. A simple example is a character wants to get from A to B but there is a C in their way. This means their plan will fail and they will have to get a new plan. I think Talespin used something similar.
> 
> 
> 
> There are some other things I would like to investigate but probably are beyond the scope of what I can do.
> 
> - Emotion states. How characters are feeling and how that causes them to change their plans
> - Personality traits. Maybe the four Keirsey Temperaments
> - Conversations. Text templating is easy but I am interested if there is some way to do it deeper.
> 
> Going to be using Clojure to do this.

## Determinism
I need to find a good library for deterministic random number generation. I want to be able to rerun the storys I had previsouly ran.
Maybe just create a project for that.

## Planner
So I wanted to have something similar to a PDDL planner.
I started to copy the 

The planner needs a few things
- A inital state. What the world is currently like
  - Objects in the world
- A goal state. What it wants the world to be
- Actions
  - Precondition
  - Effect
  - Postcondition
- The planner
  - Get a list of new states based on the action given
    - If already visited ignore
    - else try and check against goal state.
      - Continue list of new states
I am thinking I could use datascript for a lot of the post and precondition checks... Super intrested in if that would work

## Audience World
The audience has a view of the world that is given though sentences.
Might be a good idea to track this and make the generator try to maximize the new information or even the variety of sentences.

### Data-based
TODO

### Sentence-based

The easiest way to do this sentence based is to keep a history of all sentences in the story.
When we want to add a new sentence we go though and get the levenshtein distance of one sentence to the previous.
There would also be some time/step component.
So if the sentence was not seen recently then it would have a greater chance to appear again.


## Story Embyro



### You
"The audience is floating freely, like a ghost, until you give them a place to land."
- Needs to show the state of the world.
- World need to seem mostly in equilibrium. 
- Rarely restate the world.
- Mostly show new facets of the world.

"Who are we going to be? But sooner or later, we need to be someone, because if we are not inside a character, then we are not inside the story."
- Needs to show the state of the character.
- Rarely restate the character.
- Mostly show new facets of the character.

"If there are choices, the audience picks someone to whom they relate"
Make the character "relatable"

"The easiest thing to do is fade in on a character that always does what the audience would do."
Sounds good!

### Need

### Go