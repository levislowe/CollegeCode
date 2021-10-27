#lang racket
(require racket/set)

(define (union-set set1 set2)
  (set-union set1 set2))

(union-set '(1 5 5 6) '(1 5 {5}))

(set-intersect '(1 5 5 6) '(1 5 {5}))
