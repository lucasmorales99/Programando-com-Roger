(ns youtube.aula02
  (:require [youtube.core :as core]))

(defn adiciona-transacao
  [transacao-real nova-transacao]
  (conj transacao-real nova-transacao))


(defn main
  [transacoes-real]
  (->>
  (core/criar-transacao "venda" 45.78)
  (adiciona-transacao transacoes-real)
  (core/calcula-valor)))