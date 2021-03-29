public class SimpleCircle {
 double radius;

 /** buat objek simplecircle radius 1 */
 SimpleCircle() {
     radius = 1;
 }

 /** buat objek simplecircle dengan radius lebih spesifik */
 SimpleCircle(double newRadius) {
     radius = newRadius;
 }

 /** kembali ke simplecircle */
 double getArea() {
     return radius * Math.PI;
 }

 /** return perimeter simplecircle */
 double getPerimeter() {
     return 2 * radius * Math.PI;

 }

 /**Set new radius for this simplecircle */
 double setRadius(double newRadius) {
     
 }
}