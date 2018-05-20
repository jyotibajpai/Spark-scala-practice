import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object WordCount {

  //val filePath ="data/wordcount.txt"

  def loadData():RDD[String]={

    System.setProperty("hadoop.home.dir", "C:\\tools\\winutil\\")
    val conf = new SparkConf().setAppName("wordCount").setMaster("local[*]")
    val sc = new SparkContext(conf)
    sc.textFile("data/wordcount.txt").flatMap(_.split(" "))
  }
 def count(data :RDD[String]):RDD[(String,Int)]={
  val wordCount =data.map(word =>(word,1)).reduceByKey(_+_)
  wordCount
 }
  def main(args: Array[String]) {
    val d=loadData()
    val c=count(d).saveAsTextFile("data/result")



  }
}
