10 ;10

(+ 5 3 4) ;12

(- 9 1) ;8

(/ 6 2) ;3

(+ (* 2 4) (- 4 6)) ;6

(def a 3)

(def b (+ a 1))

(+ a b (* a b)) ;19

(= a b) ;false

(if (and (> b a) (< b (* a b)))
    b
    a) ;4

(cond 
    (= a 4) 6
    :else 25) ;25

(+ 2 (if (> b a) b a)) ;6