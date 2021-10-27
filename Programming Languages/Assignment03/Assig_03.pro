edge(a, b)
edge(b, c)
edge(d, c)
edge(d, b)


path(a,b) :- 
  walk(a,b,[]) 
  .path(a, b)

walk(a,b,c) :-
  edge(a,d) ,
  not(member(d,c)) ,
  ( 
    b = d
  ;
    walk(d,b,[a|c])
  .                  