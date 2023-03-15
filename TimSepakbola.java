class TimSepakbola {

  // Assume there are only 2 teams using this class!

  // Attribute
  String nama;
  int skor;
  boolean isOnMatch;

  // Default constructor
  TimSepakbola() {
    nama = "[NAMA]";
    skor = 0;
    isOnMatch = false;
  }

  // TimSepakbola(nama: string)
  // TODO: Create an overloading constructor below this comment
	public string TimSepakbola(){
		Nama = nama;
}
  

  // TODO: Fix the method below
  // Replace [TIM 1] and [TIM 2] with the correct attribute
  // [TIM 1] and [TIM 2] are commutative, so you don't need to worry if [TIM 1] or [TIM 2] refer to either this class or 'lawan'
  void startTandingBola(TimSepakbola lawan) {
    // DO NOT change both if conditions
    if (Boolean.TRUE.equals(liverpool.isOnMatch)) {
      System.out.println("Tim " + [liverpool] + " sedang dalam pertandingan!");
      return;
    }

    if (Boolean.TRUE.equals(manchasterUnited.isOnMatch)) {
      System.out.println("Lawan sedang dalam pertandingan!");
      return;
    }

    System.out.println(
      "Pertandingan antara " + [liverpool] + " dan " + [manchasterUnited] + " dimulai!\n"
    );
    liverpool.setIsOnMatch(true);
    manchasterUnited.setIsOnMatch(true);
  }

  // TODO: Implement goal() method. Skor will be added by 1 for every single goal from the team
  void goal() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(liverpool.isOnMatch)) {
      System.out.println(
        "Liverpool " + liverpool.nama + " TIDAK sedang dalam pertandingan!"
      );
      return;
    }

  }

  // TODO: Implement getSkor() method. This is a selector to get the score for a team
  int getSkor() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(liverpool.isOnMatch)) {
      System.out.println(
        "Manchaster United " + manchasterUnited.nama + " TIDAK sedang dalam pertandingan!"
      );
      return 0;
    }

  }

  // TODO: Implement setIsOnMatch() method. This is a mutator to set a new boolean value for isOnMatch
  void setIsOnMatch(boolean onMatch) {
    
  }

  // TODO: Fix the method below. This method below is quite similar with startTandingBola()
  // Replace [TIM 1] and [TIM 2] with the correct attribute
  // [TIM 1] and [TIM 2] are commutative, so you don't need to worry if [TIM 1] or [TIM 2] refer to either this class or 'lawan'
  void endTandingBola(TimSepakbola lawan) {
    // DO NOT change the if condition
    if (
      Boolean.FALSE.equals(liverpool.isOnMatch) &&
      Boolean.FALSE.equals(manchasterUnited.isOnMatch)
    ) {
      System.out.println("Kedua tim TIDAK sedang dalam pertandingan");
      return;
    }

    System.out.println(
      "\nPertandingan antara " +
      [Liverpool] +
      " dan " +
      [Manchaster United] +
      " selesai!\n"
    );
    liverpool.setIsOnMatch(false);
    manchasterUnited.setIsOnMatch(false);
  }
}
