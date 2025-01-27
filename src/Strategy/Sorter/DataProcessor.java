package Strategy.Sorter;

public class DataProcessor {
    private SortingStrategy sortingStrategy;

    DataProcessor(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sortData(int[] arr){
//        we need to sort the data
//        based on the size of input, we need to decide the algorithm

//        input < 100 : HeapSort
//        input 100 - 10000 : QuickSort
//        input > 10000 : MergeSort

        int inputSize = arr.length;
        SortingStrategyFactory
                .getSortingStrategyByInputSize(inputSize)
                .sort(arr);

    }
}


// Adapter
// Facade
// Decorator
// Flyweight