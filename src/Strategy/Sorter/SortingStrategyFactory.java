package Strategy.Sorter;

public class SortingStrategyFactory {
    public static SortingStrategy getSortingStrategyByInputSize(int inputSize) {
        SortingStrategy sortingStrategy = null;
        if(inputSize < 100){
            sortingStrategy = new HeapSortingStrategy();
        } else if (inputSize < 10000){
            sortingStrategy = new QuickSortStrategy();
        } else {
            sortingStrategy = new MergeSortStrategy();
        }
        return sortingStrategy;
    }
}
