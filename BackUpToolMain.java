����   = r  BackUpToolMain  java/lang/Object SLEEP_MILLIS I ConstantValue  �` runtime <clinit> ()V Code	   	  LineNumberTable LocalVariableTable <init>
     this LBackUpToolMain; main ([Ljava/lang/String;)V 
Exceptions  java/lang/Exception	    java/lang/System    out Ljava/io/PrintStream; " 6POV you: This is the best Backup-Tool i´ve ever used!
 $ & % java/io/PrintStream ' ( println (Ljava/lang/String;)V * java/awt/Robot
 ) 
 - / . java/awt/MouseInfo 0 1 getPointerInfo ()Ljava/awt/PointerInfo;
 3 5 4 java/awt/PointerInfo 6 7 getLocation ()Ljava/awt/Point;	 9 ; : java/awt/Point <  x	 9 > ?  y
 ) A B C 	mouseMove (II)V       

 G I H java/lang/Thread J K sleep (J)V   M N O makeConcatWithConstants (I)Ljava/lang/String; Q 	Backup... S @Relax CPU, sit back. Next folder in 60 seconds...
--------------  M      �` args [Ljava/lang/String; robot Ljava/awt/Robot; i point Ljava/awt/Point; StackMapTable 
SourceFile BackUpToolMain.java BootstrapMethods
 c e d $java/lang/invoke/StringConcatFactory N f �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; b i "--------------
JaggerBackupTool.  k "backup tool running since  Min... InnerClasses n %java/lang/invoke/MethodHandles$Lookup p java/lang/invoke/MethodHandles Lookup !               	 	      
      %      � �                         /     *� �                        �            P     �� !� #� )Y� +L=� ,� 2N+-� 8`-� =`� @ D� F+-� 8d-� =d� @ D� F+-� 8`-� =`� @ D� F+-� 8d-� =d� @ D� F� �� L  � #� P� #� R� #� `� � � d� T  � # U� F��d       N      
       )  /  ?  E  U  [  k  q  � " � # � $ � % � ' �     *    � W X    � Y Z   � [    � \ ]  ^   	 �  )  _    ` a     g  h g  j l   
  m o q 