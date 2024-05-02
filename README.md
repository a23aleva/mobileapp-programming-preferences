
# Rapport
I den här uppgiften har jag lagt till en textView och en knapp i min MainActivitys xml-fil som med hjälp av en Intent i onClickListenern i java-filen tar en vidare till min SecondActivity. Här har jag lagt till en EditView och en textView i xml:en. Genom getSharedPreferences och edit() gör jag sedan så att EditViewns input kan lagras som en preferens med hjälp av putString när appen stängs av. När onStop() sker kör jag apply() på min preferenceEditor och sparar det som skrivits in i EditViewn. I MainActivity använder jag sedan onResume() som när appen startas igen kan plocka fram samma String som sparats i preferensen med hjälp av en gemensam key. Den här stringen skrivs sedan ut i textViewn som finns tillagd i MainActivityn.

```
@Override
    protected void onResume() {
        super.onResume();

        // Read a preference
        TextView prefTextRef=new TextView(this);
        prefTextRef=(TextView)findViewById(R.id.textViewer);
        prefTextRef.setText(preferenceRef.getString("Preference1", "No preference found."));
    }
```
I kodexemplet overridas metoden onResume() som kan användas för saker som ska ske när en app återupptas. Sedan kallas superklassens onResume() för att säkerställa att aktivitetens livscykel fungerar som den ska. Efteråt skapas ett nytt TextView-objekt som sedan tilldelas en referens till TextViewn som finns i xml-filen. Slutligen används setText till den TextViewn för att skriva ut det som sparats i preferensnyckeln "Preference1".

![](Preferences1.png)
![](Preferences2.png)
