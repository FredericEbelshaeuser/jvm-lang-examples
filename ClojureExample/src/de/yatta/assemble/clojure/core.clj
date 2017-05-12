(ns example.core)

(+ 4 2)
(+ (/ 4 2) 1)
(class 42)
(class "Hi")
(if(< 1 2) (println "Yes") )
(if(> 1 2) (println "No") )
(if(> 1 2) (println "Yes") (println "No") )
(range 1 10)
(def nums (list 1 2 3))
(first nums)
(cons "foo" nums)
nums

{name "jon" :age 42}
{def person {:name "jon" :age 42}
(person :name)
 
 

(defn gaussify [start end]
     (loop [sum start cnt end]
       (
         if (= cnt start) ; if count is =0 exit loop and return the sum
         sum
           (
             ; if not add count to sum & decrease the count
             ; to put the new values back into the loop use recur
             recur (+ cnt sum) 
             (dec cnt)
           )
       )
     )
)
