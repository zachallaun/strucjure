(ns strucjure.bootstrap)

;; Pre-compiled parsers to bootstrap strucjure's syntax
(def optional (quote (clojure.core/letfn [(thunk__11745 [input__11740 true-cont__11741 false-cont__11742] (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11740) (clojure.core/nil? input__11740)) (clojure.core/let [left__11744 (clojure.core/seq input__11740)] (clojure.core/let [rest left__11744] (clojure.core/let [output__11743 nil] (.invoke true-cont__11741 output__11743 rest)))) (.invoke false-cont__11742)))] (clojure.core/fn [elem] (strucjure/->Match (clojure.core/fn [input__11740 true-cont__11741 false-cont__11742] (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11740) (clojure.core/nil? input__11740)) (clojure.core/let [left__11746 (clojure.core/seq input__11740)] (if (clojure.core/not= nil left__11746) (clojure.core/let [left__11747 (clojure.core/first left__11746)] ((.match-fn elem) left__11747 (clojure.core/fn [output__11748 rest__11749] (clojure.core/let [x output__11748] (if (clojure.core/= nil rest__11749) (clojure.core/let [left__11750 (clojure.core/next left__11746)] (clojure.core/let [rest left__11750] (clojure.core/let [output__11743 x] (.invoke true-cont__11741 output__11743 rest)))) (thunk__11745 input__11740 true-cont__11741 false-cont__11742)))) (clojure.core/fn [] (thunk__11745 input__11740 true-cont__11741 false-cont__11742)))) (thunk__11745 input__11740 true-cont__11741 false-cont__11742))) (thunk__11745 input__11740 true-cont__11741 false-cont__11742)))))))) (def zero-or-more (quote (clojure.core/letfn [(thunk__11756 [input__11751 true-cont__11752 false-cont__11753] (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11751) (clojure.core/nil? input__11751)) (clojure.core/let [left__11755 (clojure.core/seq input__11751)] (clojure.core/let [rest left__11755] (clojure.core/let [output__11754 nil] (.invoke true-cont__11752 output__11754 rest)))) (.invoke false-cont__11753)))] (clojure.core/fn [elem] (strucjure/->Match (clojure.core/fn [input__11751 true-cont__11752 false-cont__11753] (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11751) (clojure.core/nil? input__11751)) (clojure.core/let [left__11757 (clojure.core/seq input__11751)] (if (clojure.core/not= nil left__11757) (clojure.core/let [left__11758 (clojure.core/first left__11757)] ((.match-fn elem) left__11758 (clojure.core/fn [output__11759 rest__11760] (clojure.core/let [x output__11759] (if (clojure.core/= nil rest__11760) (clojure.core/let [left__11761 (clojure.core/next left__11757)] ((.match-fn (zero-or-more elem)) left__11761 (clojure.core/fn [output__11762 rest__11763] (clojure.core/let [xs output__11762] (clojure.core/let [rest rest__11763] (clojure.core/let [output__11754 (cons x xs)] (.invoke true-cont__11752 output__11754 rest))))) (clojure.core/fn [] (thunk__11756 input__11751 true-cont__11752 false-cont__11753)))) (thunk__11756 input__11751 true-cont__11752 false-cont__11753)))) (clojure.core/fn [] (thunk__11756 input__11751 true-cont__11752 false-cont__11753)))) (thunk__11756 input__11751 true-cont__11752 false-cont__11753))) (thunk__11756 input__11751 true-cont__11752 false-cont__11753)))))))) (def one-or-more (quote (clojure.core/letfn [] (clojure.core/fn [elem] (strucjure/->Match (clojure.core/fn [input__11764 true-cont__11765 false-cont__11766] (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11764) (clojure.core/nil? input__11764)) (clojure.core/let [left__11768 (clojure.core/seq input__11764)] (if (clojure.core/not= nil left__11768) (clojure.core/let [left__11769 (clojure.core/first left__11768)] ((.match-fn elem) left__11769 (clojure.core/fn [output__11770 rest__11771] (clojure.core/let [x output__11770] (if (clojure.core/= nil rest__11771) (clojure.core/let [left__11772 (clojure.core/next left__11768)] ((.match-fn (zero-or-more elem)) left__11772 (clojure.core/fn [output__11773 rest__11774] (clojure.core/let [xs output__11773] (clojure.core/let [rest rest__11774] (clojure.core/let [output__11767 (cons x xs)] (.invoke true-cont__11765 output__11767 rest))))) (clojure.core/fn [] (.invoke false-cont__11766)))) (.invoke false-cont__11766)))) (clojure.core/fn [] (.invoke false-cont__11766)))) (.invoke false-cont__11766))) (.invoke false-cont__11766)))))))) (def key&pattern (quote (clojure.core/letfn [] (strucjure/->Match (clojure.core/fn [input__11775 true-cont__11776 false-cont__11777] (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11775) (clojure.core/nil? input__11775)) (clojure.core/let [left__11779 (clojure.core/seq input__11775)] (if (clojure.core/not= nil left__11779) (clojure.core/let [left__11780 (clojure.core/first left__11779)] (clojure.core/let [key left__11780] (clojure.core/let [left__11781 (clojure.core/next left__11779)] (if (clojure.core/not= nil left__11781) (clojure.core/let [left__11782 (clojure.core/first left__11781)] ((.match-fn pattern) left__11782 (clojure.core/fn [output__11783 rest__11784] (clojure.core/let [pattern output__11783] (if (clojure.core/= nil rest__11784) (clojure.core/let [left__11785 (clojure.core/next left__11781)] (if (clojure.core/= nil left__11785) (clojure.core/let [output__11778 [key pattern]] (.invoke true-cont__11776 output__11778 nil)) (.invoke false-cont__11777))) (.invoke false-cont__11777)))) (clojure.core/fn [] (.invoke false-cont__11777)))) (.invoke false-cont__11777))))) (.invoke false-cont__11777))) (.invoke false-cont__11777))))))) (def pattern (quote (clojure.core/letfn [(thunk__11797 [input__11786 true-cont__11787 false-cont__11788] (if (seq? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11790 (clojure.core/seq input__11786)] (if (clojure.core/not= nil left__11790) (clojure.core/let [left__11791 (clojure.core/first left__11790)] (clojure.core/let [match left__11791] (clojure.core/let [left__11792 (clojure.core/next left__11790)] (if (clojure.core/not= nil left__11792) (clojure.core/let [left__11793 (clojure.core/first left__11792)] ((.match-fn pattern) left__11793 (clojure.core/fn [output__11794 rest__11795] (clojure.core/let [pattern output__11794] (if (clojure.core/= nil rest__11795) (clojure.core/let [left__11796 (clojure.core/next left__11792)] (if (clojure.core/= nil left__11796) (clojure.core/let [output__11789 (import-ast match pattern)] (.invoke true-cont__11787 output__11789 nil)) (.invoke false-cont__11788))) (.invoke false-cont__11788)))) (clojure.core/fn [] (.invoke false-cont__11788)))) (.invoke false-cont__11788))))) (.invoke false-cont__11788))) (.invoke false-cont__11788)) (.invoke false-cont__11788))) (thunk__11798 [input__11786 true-cont__11787 false-cont__11788] (if (symbol? input__11786) (clojure.core/let [variable input__11786] (clojure.core/let [output__11789 (literal-ast variable)] (.invoke true-cont__11787 output__11789 nil))) (thunk__11797 input__11786 true-cont__11787 false-cont__11788))) (thunk__11804 [input__11786 true-cont__11787 false-cont__11788] (if (seq? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11799 (clojure.core/seq input__11786)] (if (clojure.core/not= nil left__11799) (clojure.core/let [left__11800 (clojure.core/first left__11799)] (if (clojure.core/= (quote or) left__11800) (clojure.core/let [left__11801 (clojure.core/next left__11799)] ((.match-fn (one-or-more pattern)) left__11801 (clojure.core/fn [output__11802 rest__11803] (clojure.core/let [patterns output__11802] (if (clojure.core/= nil rest__11803) (clojure.core/let [output__11789 (apply or-ast patterns)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11798 input__11786 true-cont__11787 false-cont__11788)))) (clojure.core/fn [] (thunk__11798 input__11786 true-cont__11787 false-cont__11788)))) (thunk__11798 input__11786 true-cont__11787 false-cont__11788))) (thunk__11798 input__11786 true-cont__11787 false-cont__11788))) (thunk__11798 input__11786 true-cont__11787 false-cont__11788)) (thunk__11798 input__11786 true-cont__11787 false-cont__11788))) (thunk__11810 [input__11786 true-cont__11787 false-cont__11788] (if (seq? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11805 (clojure.core/seq input__11786)] (if (clojure.core/not= nil left__11805) (clojure.core/let [left__11806 (clojure.core/first left__11805)] (if (clojure.core/= (quote seq) left__11806) (clojure.core/let [left__11807 (clojure.core/next left__11805)] ((.match-fn (one-or-more pattern)) left__11807 (clojure.core/fn [output__11808 rest__11809] (clojure.core/let [patterns output__11808] (if (clojure.core/= nil rest__11809) (clojure.core/let [output__11789 (apply seq-ast patterns)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11804 input__11786 true-cont__11787 false-cont__11788)))) (clojure.core/fn [] (thunk__11804 input__11786 true-cont__11787 false-cont__11788)))) (thunk__11804 input__11786 true-cont__11787 false-cont__11788))) (thunk__11804 input__11786 true-cont__11787 false-cont__11788))) (thunk__11804 input__11786 true-cont__11787 false-cont__11788)) (thunk__11804 input__11786 true-cont__11787 false-cont__11788))) (thunk__11816 [input__11786 true-cont__11787 false-cont__11788] (if (seq? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11811 (clojure.core/seq input__11786)] (if (clojure.core/not= nil left__11811) (clojure.core/let [left__11812 (clojure.core/first left__11811)] (if (clojure.core/= (quote and) left__11812) (clojure.core/let [left__11813 (clojure.core/next left__11811)] ((.match-fn (one-or-more pattern)) left__11813 (clojure.core/fn [output__11814 rest__11815] (clojure.core/let [patterns output__11814] (if (clojure.core/= nil rest__11815) (clojure.core/let [output__11789 (apply and-ast patterns)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11810 input__11786 true-cont__11787 false-cont__11788)))) (clojure.core/fn [] (thunk__11810 input__11786 true-cont__11787 false-cont__11788)))) (thunk__11810 input__11786 true-cont__11787 false-cont__11788))) (thunk__11810 input__11786 true-cont__11787 false-cont__11788))) (thunk__11810 input__11786 true-cont__11787 false-cont__11788)) (thunk__11810 input__11786 true-cont__11787 false-cont__11788))) (thunk__11822 [input__11786 true-cont__11787 false-cont__11788] (if (seq? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11817 (clojure.core/seq input__11786)] (if (clojure.core/not= nil left__11817) (clojure.core/let [left__11818 (clojure.core/first left__11817)] (if (clojure.core/= (quote leave) left__11818) (clojure.core/let [left__11819 (clojure.core/next left__11817)] (if (clojure.core/not= nil left__11819) (clojure.core/let [left__11820 (clojure.core/first left__11819)] (clojure.core/let [form left__11820] (clojure.core/let [left__11821 (clojure.core/next left__11819)] (if (clojure.core/= nil left__11821) (clojure.core/let [output__11789 (->Leave form)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11816 input__11786 true-cont__11787 false-cont__11788))))) (thunk__11816 input__11786 true-cont__11787 false-cont__11788))) (thunk__11816 input__11786 true-cont__11787 false-cont__11788))) (thunk__11816 input__11786 true-cont__11787 false-cont__11788))) (thunk__11816 input__11786 true-cont__11787 false-cont__11788)) (thunk__11816 input__11786 true-cont__11787 false-cont__11788))) (thunk__11828 [input__11786 true-cont__11787 false-cont__11788] (if (seq? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11823 (clojure.core/seq input__11786)] (if (clojure.core/not= nil left__11823) (clojure.core/let [left__11824 (clojure.core/first left__11823)] (if (clojure.core/= (quote guard) left__11824) (clojure.core/let [left__11825 (clojure.core/next left__11823)] (if (clojure.core/not= nil left__11825) (clojure.core/let [left__11826 (clojure.core/first left__11825)] (clojure.core/let [form left__11826] (clojure.core/let [left__11827 (clojure.core/next left__11825)] (if (clojure.core/= nil left__11827) (clojure.core/let [output__11789 (->Guard form)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11822 input__11786 true-cont__11787 false-cont__11788))))) (thunk__11822 input__11786 true-cont__11787 false-cont__11788))) (thunk__11822 input__11786 true-cont__11787 false-cont__11788))) (thunk__11822 input__11786 true-cont__11787 false-cont__11788))) (thunk__11822 input__11786 true-cont__11787 false-cont__11788)) (thunk__11822 input__11786 true-cont__11787 false-cont__11788))) (thunk__11834 [input__11786 true-cont__11787 false-cont__11788] (if (seq? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11829 (clojure.core/seq input__11786)] (if (clojure.core/not= nil left__11829) (clojure.core/let [left__11830 (clojure.core/first left__11829)] (if (clojure.core/= (quote quote) left__11830) (clojure.core/let [left__11831 (clojure.core/next left__11829)] (if (clojure.core/not= nil left__11831) (clojure.core/let [left__11832 (clojure.core/first left__11831)] (clojure.core/let [quoted left__11832] (clojure.core/let [left__11833 (clojure.core/next left__11831)] (if (clojure.core/= nil left__11833) (clojure.core/let [output__11789 (literal-ast (clojure.core/seq (clojure.core/concat (clojure.core/list (quote quote)) (clojure.core/list quoted))))] (.invoke true-cont__11787 output__11789 nil)) (thunk__11828 input__11786 true-cont__11787 false-cont__11788))))) (thunk__11828 input__11786 true-cont__11787 false-cont__11788))) (thunk__11828 input__11786 true-cont__11787 false-cont__11788))) (thunk__11828 input__11786 true-cont__11787 false-cont__11788))) (thunk__11828 input__11786 true-cont__11787 false-cont__11788)) (thunk__11828 input__11786 true-cont__11787 false-cont__11788))) (thunk__11838 [input__11786 true-cont__11787 false-cont__11788] (if (vector? input__11786) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11835 (clojure.core/seq input__11786)] ((.match-fn (zero-or-more seq-pattern)) left__11835 (clojure.core/fn [output__11836 rest__11837] (clojure.core/let [seq-patterns output__11836] (if (clojure.core/= nil rest__11837) (clojure.core/let [output__11789 (seqable-ast seq-patterns)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11834 input__11786 true-cont__11787 false-cont__11788)))) (clojure.core/fn [] (thunk__11834 input__11786 true-cont__11787 false-cont__11788)))) (thunk__11834 input__11786 true-cont__11787 false-cont__11788)) (thunk__11834 input__11786 true-cont__11787 false-cont__11788))) (thunk__11839 [input__11786 true-cont__11787 false-cont__11788] (if (clojure.core/instance? java.util.regex.Pattern input__11786) (clojure.core/let [regex input__11786] (clojure.core/let [output__11789 (regex-ast regex)] (.invoke true-cont__11787 output__11789 nil))) (thunk__11838 input__11786 true-cont__11787 false-cont__11788))) (thunk__11844 [input__11786 true-cont__11787 false-cont__11788] (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11786) (clojure.core/nil? input__11786)) (clojure.core/let [left__11841 (clojure.core/seq input__11786)] ((.match-fn (zero-or-more key&pattern)) left__11841 (clojure.core/fn [output__11842 rest__11843] (clojure.core/let [keys&patterns output__11842] (if (clojure.core/= nil rest__11843) (clojure.core/let [output__11789 (map-ast keys&patterns)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11839 input__11786 true-cont__11787 false-cont__11788)))) (clojure.core/fn [] (thunk__11839 input__11786 true-cont__11787 false-cont__11788)))) (thunk__11839 input__11786 true-cont__11787 false-cont__11788))) (thunk__11845 [input__11786 true-cont__11787 false-cont__11788] (if (clojure.core/instance? clojure.lang.PersistentHashMap input__11786) (thunk__11844 input__11786 true-cont__11787 false-cont__11788) (thunk__11839 input__11786 true-cont__11787 false-cont__11788))) (thunk__11846 [input__11786 true-cont__11787 false-cont__11788] (if (clojure.core/instance? clojure.lang.PersistentArrayMap input__11786) (thunk__11844 input__11786 true-cont__11787 false-cont__11788) (thunk__11845 input__11786 true-cont__11787 false-cont__11788))) (thunk__11847 [input__11786 true-cont__11787 false-cont__11788] (if (class-name? input__11786) (clojure.core/let [class-name input__11786] (clojure.core/let [output__11789 (class-ast class-name)] (.invoke true-cont__11787 output__11789 nil))) (thunk__11846 input__11786 true-cont__11787 false-cont__11788))) (thunk__11848 [input__11786 true-cont__11787 false-cont__11788] (if (primitive? input__11786) (clojure.core/let [literal input__11786] (clojure.core/let [output__11789 (literal-ast literal)] (.invoke true-cont__11787 output__11789 nil))) (thunk__11847 input__11786 true-cont__11787 false-cont__11788))) (thunk__11849 [input__11786 true-cont__11787 false-cont__11788] (if (binding? input__11786) (clojure.core/let [binding input__11786] (clojure.core/let [output__11789 (->Bind (binding-name binding))] (.invoke true-cont__11787 output__11789 nil))) (thunk__11848 input__11786 true-cont__11787 false-cont__11788)))] (strucjure/->Match (clojure.core/fn [input__11786 true-cont__11787 false-cont__11788] (if (clojure.core/= (quote _) input__11786) (clojure.core/let [output__11789 (->Leave nil)] (.invoke true-cont__11787 output__11789 nil)) (thunk__11849 input__11786 true-cont__11787 false-cont__11788))))))) (def seq-pattern (quote (clojure.core/letfn [(thunk__11856 [input__11850 true-cont__11851 false-cont__11852] ((.match-fn pattern) input__11850 (clojure.core/fn [output__11854 rest__11855] (clojure.core/let [pattern output__11854] (clojure.core/let [output__11853 (head-ast pattern)] (.invoke true-cont__11851 output__11853 rest__11855)))) (clojure.core/fn [] (.invoke false-cont__11852)))) (thunk__11862 [input__11850 true-cont__11851 false-cont__11852] (if (seq? input__11850) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11850) (clojure.core/nil? input__11850)) (clojure.core/let [left__11857 (clojure.core/seq input__11850)] (if (clojure.core/not= nil left__11857) (clojure.core/let [left__11858 (clojure.core/first left__11857)] (if (clojure.core/= (quote guard) left__11858) (clojure.core/let [left__11859 (clojure.core/next left__11857)] (if (clojure.core/not= nil left__11859) (clojure.core/let [left__11860 (clojure.core/first left__11859)] (clojure.core/let [form left__11860] (clojure.core/let [left__11861 (clojure.core/next left__11859)] (if (clojure.core/= nil left__11861) (clojure.core/let [output__11853 (->Guard form)] (.invoke true-cont__11851 output__11853 nil)) (thunk__11856 input__11850 true-cont__11851 false-cont__11852))))) (thunk__11856 input__11850 true-cont__11851 false-cont__11852))) (thunk__11856 input__11850 true-cont__11851 false-cont__11852))) (thunk__11856 input__11850 true-cont__11851 false-cont__11852))) (thunk__11856 input__11850 true-cont__11851 false-cont__11852)) (thunk__11856 input__11850 true-cont__11851 false-cont__11852)))] (strucjure/->Match (clojure.core/fn [input__11850 true-cont__11851 false-cont__11852] (if (seq? input__11850) (if (clojure.core/or (clojure.core/instance? clojure.lang.Seqable input__11850) (clojure.core/nil? input__11850)) (clojure.core/let [left__11863 (clojure.core/seq input__11850)] (if (clojure.core/not= nil left__11863) (clojure.core/let [left__11864 (clojure.core/first left__11863)] (if (clojure.core/= (quote &) left__11864) (clojure.core/let [left__11865 (clojure.core/next left__11863)] (if (clojure.core/not= nil left__11865) (clojure.core/let [left__11866 (clojure.core/first left__11865)] ((.match-fn pattern) left__11866 (clojure.core/fn [output__11867 rest__11868] (clojure.core/let [pattern output__11867] (if (clojure.core/= nil rest__11868) (clojure.core/let [left__11869 (clojure.core/next left__11865)] (if (clojure.core/= nil left__11869) (clojure.core/let [output__11853 pattern] (.invoke true-cont__11851 output__11853 nil)) (thunk__11862 input__11850 true-cont__11851 false-cont__11852))) (thunk__11862 input__11850 true-cont__11851 false-cont__11852)))) (clojure.core/fn [] (thunk__11862 input__11850 true-cont__11851 false-cont__11852)))) (thunk__11862 input__11850 true-cont__11851 false-cont__11852))) (thunk__11862 input__11850 true-cont__11851 false-cont__11852))) (thunk__11862 input__11850 true-cont__11851 false-cont__11852))) (thunk__11862 input__11850 true-cont__11851 false-cont__11852)) (thunk__11862 input__11850 true-cont__11851 false-cont__11852)))))))
