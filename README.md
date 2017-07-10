# CIES
clinical text mining
Our system is ClinicInformationExtractionSystem
You can double-click to run the jar package, or run at Windows's CMD
First,you need to download the ClinicInformationExtractionSystem.jar, and you can creat a folder,the contents of the folder are as shown in folder.jpg, and it cannot be changed.As the picture shows,there are three parts:the desc folder,the lib folder and the  ClinicInformationExtractionSystem.jar. Please follow the instructions below.
1 Download the ModelDR、model event、modeltime and word2vec_format and put them into the desc folder.
2 Download the bioASQ word2vectors from http://bioasq.lip6.fr/tools/BioASQword2vec/.
3 Decompressing files，merge the words with the vectors into one file,named biovector.txt.
4 Break the file into 171 sub files，and we have already upload the code.Please refer to the pictures we uploaded,and put all these into the desc folder.
5 Download the CRF++ tool from https://sourceforge.net/projects/crfpp/, and also put it into the lib folder.
6 Download the UIMA tools from http://uima.apache.org/, and put all the jars into the lib folder.
7 Download the Standford coreNLP tools from https://stanfordnlp.github.io/CoreNLP/, and put all the jars into the lib folder.
8 Download the libSVM from http://www.csie.ntu.edu.tw/~cjlin/libsvm/, and put it into the lib folder.





