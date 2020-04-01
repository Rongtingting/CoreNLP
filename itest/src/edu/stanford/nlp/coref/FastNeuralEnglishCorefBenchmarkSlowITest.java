package edu.stanford.nlp.coref;

import edu.stanford.nlp.util.logging.Redwood;

import java.io.IOException;

public class FastNeuralEnglishCorefBenchmarkSlowITest extends CorefBenchmark {

  @Override
  public void setUp() throws Exception, IOException {
    logger = Redwood.channels(StatisticalCorefCoNLLBenchmarkSlowITest.class);
    EXPECTED_F1_SCORE = 60.12;
    PROPERTIES_PATH =  "edu/stanford/nlp/coref/properties/fastneural-english-conll.properties";
    WORK_DIR_NAME = "FastNeuralCorefBenchmarkTest";
    testName = "Fast Neural English Coref (CoNLL)";
    super.setUp();
  }

}
