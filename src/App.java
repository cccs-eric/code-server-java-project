import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class App {
    public static void main(String[] args) {
        SparkSession spark = SparkSession
                .builder()
                .appName("Test")
                .config("spark.sql.shuffle.partitions", 4)
                .config("spark.driver.cores", 1)
                .config("spark.driver.memory", "1G")
                .config("spark.executor.memory", "2G")
                .config("spark.cores.max", 10)
                .config("spark.executor.cores", 10)
                .config("spark.sql.streaming.stateStore.rocksdb.compactOnCommit", true)
                .master("spark://ver-1-spark-master-svc.spark:7077")
                .getOrCreate();

        spark.sql("select 1").show();

        spark.stop();
    }
}