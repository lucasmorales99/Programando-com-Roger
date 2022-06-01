(ns youtube.core
  (:gen-class))

(defn criar-transacao
  [nome valor]
  {:nome nome :valor valor})

(def transacoes
  [
    (criar-transacao "venda" 12.99)
    (criar-transacao "venda" 123.45)
    (criar-transacao "compra" -100)
    (criar-transacao "compra" -1.99)
    (criar-transacao "deposito" 999.99)
  ])

;---------------------------
;----------MAP-----------
;---------------------------


(defn get-valores-a
  [transacoes-real]
  (map :valor transacoes-real))

(defn get-valores-b
  [transacoes-real]
  (map (fn [x](:valor x)) transacoes-real))

(defn get-valores-c
  [transacoes-real]
  (map #(:valor %) transacoes-real)) ;a "#" é como se fosse um forit na transacoes-real

;---------------------------
;------------REDUCE---------; ele pega tudo que tem dentro e faz uma recursao
;---------------------------

(defn calcula-valor
  [transacoes-real]
  (reduce + (get-valores-a transacoes-real)))

;---------------------------
;---------FILTER------------
;---------------------------

;------vendas--
(defn eh-uma-venda?
  [transacao-real]
  (= "venda"(:nome transacao-real)))

(defn get-vendas
  [transacoes-real]
  (filter eh-uma-venda? transacoes-real))

;------compras--
(defn eh-uma-compra?
  [transacao-real]
  (= "compra"(:nome transacao-real)))

(defn get-compras
  [transacoes-real]
  (filter eh-uma-compra? transacoes-real))


(defn -main
  [& args]
  (println "Hello, World!"))


  ; nil == null == none
