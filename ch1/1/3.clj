(defn max [x, y] (if(> x y) x y))

(defn square [x] (* x x))

(defn sum-of-squares-of-greatest [x, y, z]
    (cond
        (and (<= x y) (<= x z)) (+ (square y) (square z))
        (and (<= y x) (<= y z)) (+ (square x) (square z))
        (and (<= z x) (<= z y)) (+ (square x) (square y))))

(sum-of-squares-of-greatest 3 777 1)