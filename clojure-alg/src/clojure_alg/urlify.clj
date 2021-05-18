(ns clojure-alg.urlify
  (:require [clojure.string :as str]))

(defn split-string [string]
  (str/split string #""))

(defn urlify [string]
  (loop [urlify-string ""
         previous-token? false
         string (split-string (str/trim string))]
    (if (empty? string)
      urlify-string
      (let [character (first string)]
        (if (not (= character " "))
          (recur (str urlify-string character)
                 false
                 (rest string))
          (let [urlify-string-modified (if (not previous-token?)
                                         (str urlify-string "%20")
                                         urlify-string)]
            (recur urlify-string-modified
                   true
                   (rest string))))))))

(println (urlify "Mr John Smith     ")) ; 'Mr%20John%20Smith'
(println (urlify "  Minä    kirjoin    Clojure      ")) ; 'Minä%20kirjoin%20Clojure'