(defn square [x]
  ( * x x ))

(def yucky 22/7)

(fn [x y]
  (println "Making a set")
  #{x y})

((fn [x y z]
   (println "Making a set")
   #{x y z})
 1 2 3)

(def make-set
  (fn [x y]
    (println "Making a set")
    #{x y}))

(defn make-another-set
  "Takes two values and makes a set from them"
  [x y]
  (println "Making a set")
  #{x y})


(defn make-yet-another-set
  ([x] #{x})
  ([x y] #{x y})
  ([x y z] #{x y z}))


(defn arity2+ [first second & more]
  (vector first second more))

(def make-list0 #(list))

(def make-list2 #(list %1 %2))

(def make-list2+ #(list %1 %2 %&))
