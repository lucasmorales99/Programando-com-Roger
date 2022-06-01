if(valor > 0){
  verdadeiro
}else{
  falso
}



(defn maior-que-zero?
    [valor]
    (if (> valor 0)
        "verdadeiro"
        "false"))

(defn maior-que-zero?
    [valor]
    (> valor 0))
// isso já vai retornar true ou false