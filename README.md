# Smart Task Manager API

## 📌 Project Overview
The **Smart Task Manager API** is a lightweight backend system built with **Spring Boot**.  
It allows users to create, view, update, and delete tasks while showcasing Agile and DevOps practices such as **CI/CD, automated testing, and monitoring**.

---

## 🎯 Product Vision
Deliver a simple yet robust task management API that demonstrates:
- Iterative Agile development
- Continuous Integration & Deployment
- Automated testing
- Application monitoring

---

## 📋 Product Backlog (User Stories)

- **[US-01: Create Task](ca://s?q=User_story_Create_Task)**  
  POST request creates a task with title and status, saved in DB.

- **[US-02: View All Tasks](ca://s?q=User_story_View_All_Tasks)**  
  GET request returns all tasks in JSON.

- **[US-03: Update Task](ca://s?q=User_story_Update_Task)**  
  PUT request updates task fields by ID, returns updated task.

- **[US-04: Delete Task](ca://s?q=User_story_Delete_Task)**  
  DELETE request removes task by ID.

- **[US-05: Input Validation](ca://s?q=User_story_Input_Validation)**  
  Title cannot be empty, invalid input returns HTTP 400.

- **[US-06: Automated Testing](ca://s?q=User_story_Automated_Testing)**  
  Unit tests for service layer, integration tests for API endpoints.

- **[US-07: CI/CD Pipeline](ca://s?q=User_story_CI_CD_Pipeline)**  
  GitHub Actions pipeline runs build + tests on push/PR.

- **[US-08: Monitoring](ca://s?q=User_story_Monitoring)**  
  Actuator health and metrics endpoints enabled.

---

## 🔝 Backlog Prioritization
- **Highest Priority:** Create Task, View Tasks, CI/CD Pipeline
- **High Priority:** Update Task, Delete Task, Validation
- **Medium Priority:** Testing improvements, Monitoring

---

## 🏃 Sprint Planning

### Sprint 1
- Implement Create Task (US‑01)
- Implement View Tasks (US‑02)
- Set up CI/CD pipeline (US‑07)
- Add unit testing framework (US‑06)
- Basic monitoring (US‑08)

**Goal:** Deliver a working REST API with automated build/test pipeline.

---

### Sprint 2
- Implement Update Task (US‑03)
- Implement Delete Task (US‑04)
- Add input validation (US‑05)
- Improve integration testing (US‑06)
- Enhance monitoring endpoints (US‑08)

**Goal:** Deliver complete CRUD API with validation and improved testing.

---

## ✅ Definition of Done
A user story is complete when:
- Code is implemented and committed
- Feature tested manually or via automation
- Unit/integration tests pass
- CI pipeline review successful
- No critical bugs present
- Feature documented or demonstrated

---

## ⚙️ Agile Approach
- Iterative sprint‑based development
- Continuous integration
- Incremental delivery
- Backlog prioritization
- Retrospectives for reflection

---

## 📖 Summary
This backlog and sprint plan provides a clear roadmap for delivering the Smart Task Manager API in **two iterative sprints**, ensuring development is organized, testable, and aligned with DevOps practices.

